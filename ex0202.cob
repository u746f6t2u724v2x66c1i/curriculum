identification     division.
program-id.        ex0202.
data               division.
working-storage    section.
01  DATA1          pic 9(8) value 100.
01  DATA2          pic 9(8) value  35.
01  DATA3          pic 9(8).
01  DATA4          pic 9(8).
01  DATA5          pic 9(8).
procedure          division.
rtn-start.
    compute  DATA3 = DATA1 + DATA2.
    display  "DATA1=" DATA1 " DATA2=" DATA2
             "   計算結果  DATA3=" DATA3.
    compute  DATA4 = DATA1 * DATA3.
    display  "DATA1=" DATA1 " DATA3=" DATA3
             "   計算結果  DATA4=" DATA4.
    compute  DATA4 = DATA1 * (DATA1 + DATA2).
    display  "DATA1=" DATA1 " DATA2=" DATA2
             "   計算結果  DATA4=" DATA4.
    compute  DATA5 = DATA4 / DATA2.
    display  "DATA4=" DATA4 " DATA2=" DATA2
             "   計算結果  DATA5=" DATA5.
    compute  DATA5 rounded = DATA4 / DATA2.
    display  "DATA4=" DATA4 " DATA2=" DATA2
             "   計算結果  DATA5=" DATA5.    
    stop run.        
