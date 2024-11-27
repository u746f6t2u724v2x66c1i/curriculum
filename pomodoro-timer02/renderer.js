let workTime = 25 * 60; // 作業時間（25分）
let breakTime = 5 * 60; // 休憩時間（5分）
let isWorkSession = true; // 作業セッションか休憩セッションかのフラグ
let timerInterval;

const workAudio = new Audio("work.wav"); // 作業終了時の音声
const breakAudio = new Audio("break.wav"); // 休憩終了時の音声

// タイマー開始関数
function startPomodoro() {
  if (timerInterval) clearInterval(timerInterval); // 既存タイマーをクリア
  
  let time = isWorkSession ? workTime : breakTime; // 作業・休憩時間を設定
  
  timerInterval = setInterval(() => {
    const minutes = Math.floor(time / 60);
    const seconds = time % 60;
    document.getElementById("timer").textContent = `${String(minutes).padStart(2, '0')}:${String(seconds).padStart(2, '0')}`;
    
    if (time <= 0) {
      clearInterval(timerInterval);
      if (isWorkSession) {
        workAudio.play(); // 作業終了時の音を鳴らす
        new Notification("Pomodoro Timer", { body: "Work session is over! Take a break." });
      } else {
        breakAudio.play(); // 休憩終了時の音を鳴らす
        new Notification("Pomodoro Timer", { body: "Break is over! Back to work." });
      }
      isWorkSession = !isWorkSession; // セッションを切り替える
      startPomodoro(); // 次のセッションを開始
    } else {
      time--;
    }
  }, 1000);
}

