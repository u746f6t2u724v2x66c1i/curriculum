import java.nio.ByteBuffer;

public class ByteBufferExample {
    public static void main(String[] args) {
        int bufferSize = 10;
        ByteBuffer buffer = ByteBuffer.allocateDirect(bufferSize);

        // Use buffer as if it were a pointer to native memory
        for (int i = 0; i < bufferSize; i++) {
            buffer.put(i, (byte) i);
        }

        // Read from the buffer
        for (int i = 0; i < bufferSize; i++) {
            System.out.print(buffer.get(i) + " ");
        }
        System.out.println();
    }
}

