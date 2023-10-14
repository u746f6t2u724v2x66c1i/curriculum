def main
  puts 'Enter six natural numbers (A B C D E F): '
  a = gets.split.map(&:to_i)

  max_value = a.max
  min_value = a.min

  puts "Maximum value: #{max_value}"
  puts "Minimum value: #{min_value}"
  puts "Difference: #{max_value - min_value}"
end

main

