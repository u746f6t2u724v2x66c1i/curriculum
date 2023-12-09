puts "Enter a number: "
N = gets.chomp.to_i

(1..N).each do |i|
  (1..N).each do |j|
    if j % N != 0
      print "#{i * j} "
    else
      puts i * j
    end
  end
end

