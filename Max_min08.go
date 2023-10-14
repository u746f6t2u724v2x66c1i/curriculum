package main

import (
	"fmt"
	"sort"
)

func main() {
	var a [6]int

	fmt.Print("Enter three natural numbers (A B C D E F): ")
	for i := 0; i < 6; i++ {
		_, err := fmt.Scan(&a[i])
		if err != nil {
			fmt.Println("Error reading input:", err)
			return
		}
	}

	// Sort the array
	sort.Ints(a[:])

	max := a[5] // Maximum value
	min := a[0] // Minimum value

	// Calculate and print the difference
	fmt.Println("Maximum value:", max)
	fmt.Println("Minimum value:", min)
	fmt.Println("Difference:", max-min)
}

