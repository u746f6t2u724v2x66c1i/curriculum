identification     division.
program-id.        ex040372.
data               division.
working-storage    section.
01  DATA1          pic 9(3).
01  COUNTER1       pic 9(8) value zero.
01  COUNTER2       pic 9(8) value zero.
01  DATA2          PIC 9(8).
procedure          division.
RTN-START.
    perform  until  COUNTER1  >  9
        display  "点数を入力してください。"
        accept  DATA1
        add  1  to  COUNTER1
        add  DATA1  to  COUNTER2
        compute  DATA2  =  COUNTER2  /  COUNTER1  
        display  "平均点数＝"  DATA2
        display  "合計点数＝"  COUNTER2
    end-perform.
    stop  run.
    
