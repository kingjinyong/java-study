package chapter8;

class TryWithResourceEx {
    public static void main(String[] args) {
        try (CloseableResource cr = new CloseableResource()) {
            cr.exceptionWork(false);
        } catch (WorkException | CloseException e) {
            e.printStackTrace();
        }
        System.out.println();
        try (CloseableResource cr = new CloseableResource()) {
            cr.exceptionWork(true);
        } catch (WorkException | CloseException e) {
            e.printStackTrace();
        }
    }
}

class CloseableResource implements AutoCloseable {
    public void exceptionWork(boolean exception) throws WorkException {
        System.out.println("exceptionWork(" + exception + ") 가 호출됨");

        if (exception) {
            throw new WorkException("WorkException발생!!");
        }
    }

    public void close() throws CloseException {
        System.out.println("close() 가 호출 됨");
        throw new CloseException("CloseException발생!!!");
    }
}

class WorkException extends Exception {
    WorkException(String msg) {
        super(msg);
    }
}

class CloseException extends Exception {
    CloseException(String msg) {
        super(msg);
    }
}
