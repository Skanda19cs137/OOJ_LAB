class NewThread implements Runnable {
Thread t;
NewThread() {
t = new Thread(this, "Demo Thread");
t.start();
}
public void run() {
try {
for(int i = 25; i > 0; i--) {
System.out.println("CSE");
Thread.sleep(2000);
}
} catch (InterruptedException e) {
System.out.println("thread2 interrupted.");
}
System.out.println("Exiting  thread2.");
}
}
class Thread1 {
public static void main(String args[]) {
new NewThread(); 
try {
for(int i = 5; i > 0; i--) {
System.out.println("BMS College of Engineering");
Thread.sleep(10000);
}  } catch (InterruptedException e) {
System.out.println("Main thread interrupted.");
}
System.out.println("Main thread exiting.");
}   }
