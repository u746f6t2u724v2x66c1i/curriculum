def linear_search(arr, target)
  arr.each_with_index do |item, index|
    return index if item == target
  end
  return -1
end

# Example usage
input_arr = [64, 34, 25, 12, 22, 11, 90]
target = 22
output_index = linear_search(input_arr, target)
puts output_index
# Output: 4
