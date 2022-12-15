public interface Protocol {
    int PORT  = 4999;
    int ADD_ITEM = 1;
    int CHECK_INVENTORY = 2;
    int TAKE_ITEM = 3;
    int GET_THRESHOLD = 4;
    int QUIT = 5;
    int INVALID_COMMAND = 5;
    String CLOSED = "CLOSED";
    String SUCCEED = "SUCCEED";

    String FAIL = "FAILED";
}
