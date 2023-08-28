package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

func staircase(n int) {
	for i := 0; i < n; i++ {
		fmt.Printf(strings.Repeat(" ", n-i-1) + strings.Repeat("#", i+1) + "\n")
	}
}

func main() {
	reader := bufio.NewReader(os.Stdin)
	nStr, _ := reader.ReadString('\n')
	nStr = strings.TrimSpace(nStr)
	n, _ := strconv.Atoi(nStr)
	staircase(n)
}
