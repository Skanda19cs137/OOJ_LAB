class Counter implements Runnable {
int count;
Thread t;
private volatile boolean running = true;
public Counter(int x ,int p) {
t = new Thread(this);
count=x;
t.setPriority(p);

}
void inc(){
count=count+1;
}
int getCount(){
return count;
}
public void run() {

while (running) {
inc(); }
}
public void stop() { running = false; }
public void start() { t.start(); } 
}
class main_class {
public static void main(String args[])
{

Thread.currentThread().setPriority(
Thread.MAX_PRIORITY);
Counter C1 = new Counter(5,(Thread.NORM_PRIORITY-2));
Counter C2 = new Counter(5,Thread.NORM_PRIORITY);
Counter C3 = new Counter(5,(Thread.NORM_PRIORITY+3));
C1.start();
C2.start();
C3.start();

try {

Thread.sleep(1000);

} catch (InterruptedException e) {

System.out.println("Main thread interrupted."); }

C1.stop();
C2.stop();
C3.stop();

try {

C1.t.join();
C2.t.join();
C3.t.join();
} catch (InterruptedException e) {

System.out.println("InterruptedExceptioncaught"); }
System.out.println("Low-priority thread   : " +C1.getCount());
System.out.println("Medium-priority thread: " +C2.getCount());
System.out.println("High-priority thread  : " +C3.getCount()); 
}
}

