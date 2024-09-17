<?php
for ($i = 1; $i <= 9; $i++) {
    for ($j = 1; $j <= 9; $j++) {
        if ($j % 9 != 0) {
            echo $i * $j . " ";
        } else if ($j % 9 == 0 && $i % 9 != 0) {
            echo $i * $j . "\n";
        } else if ($j % 9 == 0 && $i % 9 == 0) {
            echo $i * $j;
        }
    }
}
?>

