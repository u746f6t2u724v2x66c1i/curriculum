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
		console.log(`ガソリンは${gass}です`);
		console.log(`ナンバーは${cnum}です`);
	}
}

//「ガソリン」オブジェクト作成
let gass = new Car('○○');
gass.getNumGas();

//「ナンバー」オブジェクト作成
let cnum = new Car('△△');
cnum.getNumGas();
