n, m = gets.split.map(&:to_i)
a = gets.split.map(&:to_i)
b = gets.split.map(&:to_i)

nextIndex = 0
b.each do |x|
    x.times do |i|
        print a[nextIndex]
        if i < x - 1
            print " "
        else
            puts
        end

        nextIndex += 1
    end
end

