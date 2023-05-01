import std.stdio;
import std.algorithm;
import std.range;

void main()
{
    // さあ始めましょう!
    writeln("Hello World!");

    // 経験豊富なプログラマ向けサンプル:
    // 3つの配列を取り、新しいメモリ割り当てなしで、
    // インプレースですべての配列をソート
    int[] arr1 = [4, 9, 7];
    int[] arr2 = [5, 2, 1, 10];
    int[] arr3 = [6, 8, 3];
    sort(chain(arr1, arr2, arr3));
    writefln("%s\n%s\n%s\n", arr1, arr2, arr3);

    // このサンプルについてさらに学びたいなら、
    // メニューの "Dの応用" にある
    // "レンジアルゴリズム" のページを見てください。
}
