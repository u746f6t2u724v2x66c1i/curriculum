123456*890123456789012345678901234567890123456789012345678901234567890
       IDENTIFICATION DIVISION.
       PROGRAM-ID.    SAMPLE1.
       AUTHOR. Eiichi Fuse.        
       ENVIRONMENT DIVISION.
       DATA DIVISION.
       WORKING-STORAGE SECTION.
         77 CMD PIC 9.
       PROCEDURE DIVISION.
       PG-TOP.
       DISPLAY "Hello World".
       ACCEPT CMD.
       IF CMD = 0 THEN GO TO PG-TOP.
       STOP RUN.