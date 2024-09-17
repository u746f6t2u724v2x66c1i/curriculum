#include <iostream> //cout for printing
#include <algorithm> //for_each defined here

//create the function (print the square)
void print_square(int i) {
    std::cout << i*i << " ";
}

int main() {
    //create the array
    int ary[] = {1, 2, 3, 4, 5};
    //stl for_each
    std::for_each(ary, ary + 5, print_square);
    
    // Add a new line at the end
    std::cout << std::endl;

    return 0;
}

