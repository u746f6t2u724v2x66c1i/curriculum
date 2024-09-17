package main

import (
	"fmt"
	"bufio"
	"os"
	"strconv"
	"strings"
)

func main() {
	var N int
	fmt.Scanln(&N)

	A := make([]int, N)

	// Read the integers into the array
	scanner := bufio.NewScanner(os.Stdin)
	scanner.Scan()
	inputs := strings.Fields(scanner.Text())
	for i := 0; i < N; i++ {
		A[i], _ = strconv.Atoi(inputs[i])
	}

	// Print the elements of A in reverse order
	for i := N - 1; i >= 0; i-- {
		fmt.Printf("%d ", A[i])
	}

	// Print a new line at the end
	fmt.Println()
}
