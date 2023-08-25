       IDENTIFICATION DIVISION.
       PROGRAM-ID. PurchaseCalculator.

       DATA DIVISION.
       WORKING-STORAGE SECTION.
       01 CUSTOMER-RECORD.
          05 CUSTOMER-ID      PIC 9(5).
          05 PURCHASE-AMOUNT  PIC S9(7)V99.

       01 TOTAL-PURCHASES     PIC S9(9)V99 VALUE 0.

       PROCEDURE DIVISION.
          PERFORM UNTIL CUSTOMER-ID = 0
              DISPLAY "Enter customer ID (0 to exit): "
              ACCEPT CUSTOMER-ID
              IF CUSTOMER-ID NOT = 0
                  DISPLAY "Enter purchase amount: "
                  ACCEPT PURCHASE-AMOUNT
                  ADD PURCHASE-AMOUNT TO TOTAL-PURCHASES
              END-IF
          END-PERFORM.

          DISPLAY "Total purchases: ", TOTAL-PURCHASES.
          STOP RUN.
