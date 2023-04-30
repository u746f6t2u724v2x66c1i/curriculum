import core.thread;
import std.stdio;
void main() {
    import std.range : iota, retro;
    write("Greeting in ");
    foreach(num; iota(1, 4).retro) {
        writef("%s...", num);
        stdout.flush();
        Thread.sleep(1.seconds);
    }
    writeln();
    writeln("Hello world!");
}/* 



$ rdmd hello01.d

$ gdc hello01.d

$ ./a.out
Greeting in 3...2...1...
Hello world!

*/
