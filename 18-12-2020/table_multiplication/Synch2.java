class Table {
void printable(int n) {
System.out.print("[");
for(int i=1;i<=10;i++)
	System.out.print(i*n+"  ");
try {
Thread.sleep(1000);
} catch (InterruptedException e) {
System.out.println("Interrupted");
}
System.out.println("]"); } }
class caller implements Runnable {
int n;
Table target;
Thread t;
public caller(Table targ, int s) {
target = targ;
n = s;
t = new Thread(this);
t.start();
}
// synchronize printables to printable()
public void run() {
synchronized(target) { // synchronized block
target.printable(n); } } }
class Synch2 {
public static void main(String args[]) {
Table target = new Table();
caller ob1 = new caller(target, 5);
caller ob2 = new caller(target, 100);
// wait for threads to end
try {
ob1.t.join();
ob2.t.join();
} catch(InterruptedException e) {
System.out.println("Interrupted");
}
}
}
