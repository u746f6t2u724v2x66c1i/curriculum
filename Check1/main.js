let numbers = [2, 5, 12, 13, 15, 18, 22];

for (let i = 0; i < numbers.length; i++) {
	if (numbers[i] % 2 === 0) {
    		console.log(numbers[i] + 'は偶数です');
	}
}
	

//ここに答えを実装してください。↓↓↓

class Car {
	//コンストラクタ
	constructor(gass,cnum) {
		this.gass = gass;
		this.cnum = cnum;
	}
	
	//ガソリンとナンバーのメソッド（関数）作成
	getNumGas() {
		console.log(`ガソリンは${this.gass}です。ナンバーは${this.cnum}です`);
	}
}

//「ガソリン」と「ナンバー」のオブジェクト作成
let carobje = new Car('〇〇','△△');
carobje.getNumGas();
