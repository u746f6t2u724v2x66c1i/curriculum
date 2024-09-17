n = gets.chomp

(0...n.length).each do |i|
  print "," if i != 0 && i % 3 == 0
  print n[i]
end

puts

