/*  while 文を使って株の損失を計算するプログラムを作ってみた。DAYトレーディングで1日に合計金額の１％の損失があるものとして１億円の元金が４６０営業日目に１００万円を下回るとゆう計算結果が出た。*/
#include  <stdio.h>

int main(void)
{
    int  day=1;
    float  money=10000.0;
    while  (money>=100.0)  {
        printf("%d日目の合計=%f万円\n",day,money);
        day++;
        money=(float)0.99*money;
    }
    return 0;
}
/*　このプログラムを実行すると４５９日目に合計金額が約１００万２１２３円になることが判る。　*/
