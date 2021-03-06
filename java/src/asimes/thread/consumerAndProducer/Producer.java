package asimes.thread.consumerAndProducer;

/**
 * Created by lianglab on 2016/8/8.
 * 功能 ：
 */
public class Producer extends Thread {
    private MyService service;
    private int index;
    public Producer(MyService service,int index) {
        super();
        this.service = service;
        this.index = index;
    }

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            service.produceFood(index);
        }
    }
}
