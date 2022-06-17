/*  while 文を使って株の利益を計算するプログラムを作ってみた。DAYトレーディングで1日に合計金額の１％の利益があるものとして１００万円の元金が４６４営業日目に１億円を上回るとゆう計算結果が出た。*/
#include  <stdio.h>

int main(void)
{
    int  day=1;
    float  money=100.0;
    while  (money<10000.0)  {
        printf("%d日目の合計=%f万円\n",day,money);
        day++;
        money=(float)1.01*money;
    }
    return 0;
}
/*　このプログラムを実行すると４６３日目に合計金額が約９９１９万１１２３円になることが判る。　*/
