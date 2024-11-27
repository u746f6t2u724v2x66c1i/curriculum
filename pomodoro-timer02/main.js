const { app, BrowserWindow } = require('electron');
const path = require('path');

// ハードウェアアクセラレーションの無効化
app.disableHardwareAcceleration();

function createWindow() {
  const win = new BrowserWindow({
    width: 400,
    height: 300,
    webPreferences: {
      preload: path.join(__dirname, 'renderer.js'),
      contextIsolation: true, // <- このオプション
      enableRemoteModule: false,
    },
  });

  win.loadFile('index.html');
}

app.whenReady().then(createWindow);

app.on('window-all-closed', () => {
  if (process.platform !== 'darwin') app.quit();
});

app.on('activate', () => {
  if (BrowserWindow.getAllWindows().length === 0) createWindow();
});
