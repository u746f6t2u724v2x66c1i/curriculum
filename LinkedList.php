<?php
class Node{
    public $data;
    public $next;
    function __construct($d)
    {
        $this->data = $d;
        $this->next = NULL;
    }
}
class Solution{
    // Function to insert a new node at the end of the linked list
    public function insert($head, $data) {
        $newNode = new Node($data);

        if ($head === null) {
            // If the list is empty, the new node becomes the head
            $head = $newNode;
        } else {
            // Traverse to the end of the list and add the new node
            $current = $head;
            while ($current->next !== null) {
                $current = $current->next;
            }
            $current->next = $newNode;
        }

        return $head;
    }

function display($head){
        $start=$head;
        while($start){
            echo $start->data,' ';
            $start=$start->next;
        }
        echo PHP_EOL; // Line break added
    }
}
$T=intval(fgets(STDIN));
$head=null;
$mylist=new Solution();
while($T-->0){
    $data=intval(fgets(STDIN));
    $head=$mylist->insert($head,$data);
}
$mylist->display($head);
?>
