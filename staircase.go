package main

import "fmt"

func staircase(n int) {
  for i := 0; i < n; i++ {
    for j := 0; j < n-i-1; j++ {
      fmt.Print(" ")
    }
    for j := 0; j <= i; j++ {
      fmt.Print("#")
    }
    fmt.Println()
  }
}

func main() {
  n := 0
  fmt.Scanf("%d", &n)
  staircase(n)
}

