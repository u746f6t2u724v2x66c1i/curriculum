<?php
echo "Enter a number: ";
$N = intval(fgets(STDIN));

for ($i = 1; $i <= $N; $i++) {
    for ($j = 1; $j <= $N; $j++) {
        if ($j % $N != 0) {
            echo $i * $j . " ";
        } else {
            echo $i * $j . PHP_EOL;
        }
    }
}
?>

