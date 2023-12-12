      *編集項目を使う
       IDENTIFICATION DIVISION.
       PROGRAM-ID. SAMPLE-03.
*
       ENVIRONMENT DIVISION.
*
       DATA DIVISION.
       WORKING-STORAGE SECTION.
       01 X PIC 9(5).
       01 Y PIC ZZZZ9.
*
       PROCEDURE DIVISION.
       MAIN.
       MOVE 500 TO X Y
       DISPLAY "X の内容は " X
       DISPLAY "Y の内容は " Y
       STOP RUN.
