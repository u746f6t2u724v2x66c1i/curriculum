(1..9).each do |i|
  (1..9).each do |j|
    if j % 9 != 0
      print "#{i * j} "
    else
      puts "#{i * j}"
    end
  end
end

