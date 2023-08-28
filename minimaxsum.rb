#!/bin/ruby

require 'json'
require 'stringio'

def miniMaxSum(arr)
    total_sum = arr.sum
    max_value = arr.max
    min_value = arr.min
    
    max_sum = total_sum - min_value
    min_sum = total_sum - max_value
    
    puts "#{min_sum} #{max_sum}"
end

arr = gets.rstrip.split.map(&:to_i)

miniMaxSum arr
