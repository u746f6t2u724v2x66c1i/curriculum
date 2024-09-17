<?php
class Difference {
    private $elements = array();
    public $maximumDifference;

    // Constructor to initialize the elements array
    public function __construct($elements){
        $this->elements = $elements;
    }

    // Method to compute the maximum absolute difference
    public function computeDifference(){
        $min = PHP_INT_MAX;
        $max = PHP_INT_MIN;

        // Find the minimum and maximum values in the elements array
        foreach($this->elements as $element){
            $min = min($min, $element);
            $max = max($max, $element);
        }

        // Calculate the maximum absolute difference
        $this->maximumDifference = abs($max - $min);
    }
} // End of Difference class

$N = intval(fgets(STDIN));
$a = array_map('intval', explode(' ', fgets(STDIN)));
$d = new Difference($a);
$d->computeDifference(); // Fix: Use camelCase for method name
print($d->maximumDifference);
?>

