//Taiyakiクラスを作成
class Taiyaki {

	//コンストラクタ
	constructor(nakami){
		this.nakami = nakami;
	}
	
	//食べるメソッド（関数）作成
	eat()　{
		console.log('中身は${this.nakami}です');
	}
}
//「あんこ」オブジェクト作成
let anko = new Taiyaki('あんこ');
anko.eat();

//「クリーム」オブジェクト作成
let cream = new Taiyaki('クリーム');
cream.eat();

//「チーズ」オブジェクト作成
let cheese = new Taiyaki('チーズ');
cheese.eat();
