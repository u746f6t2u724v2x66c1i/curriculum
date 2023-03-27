require 'tensorflow'
a = TensorFlow.constant(3)
b = TensorFlow.constant(4)
c = TensorFlow.add(a, b)
puts c.eval # Output: 7
