public class Task5 {
    public static void main(String[] args) throws TCPException {
        try {
            int i = 3 / 0;
        } catch (Exception e) {
            throw new TCPException("发生了除零错误！");
        }
    }
}

class TCPException extends Exception{
    public TCPException() {
    }

    public TCPException(String message) {
        super(message);
    }
}
