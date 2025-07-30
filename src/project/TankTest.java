package project;

public class TankTest {

    static class Tank {
        private boolean isFull;
        private boolean isReleased;

        // Fill the tank
        public void fill() {
            isFull = true;
            System.out.println("Tank filled.");
        }

        // Empty the tank
        public void empty() {
            isFull = false;
            System.out.println("Tank emptied.");
        }

        // Mark tank as released (termination condition)
        public void releaseTank() {
            isReleased = true;
            System.out.println("Tank released successfully.");
        }

        // finalize method to check if tank is released
        @Override
        protected void finalize() throws Throwable {
            if (!isReleased) {
                System.out.println("Error: Tank was not released properly before cleanup!");
            } else {
                System.out.println("Tank finalized safely.");
            }
            super.finalize();
        }
    }

    public static void main(String[] args) {
        // Scenario 1: Properly released tank
        Tank tank1 = new Tank();
        tank1.fill();
        tank1.empty();
        tank1.releaseTank();
        tank1 = null;

        // Scenario 2: Tank not released
        Tank tank2 = new Tank();
        tank2.fill();
        tank2 = null;

        System.gc(); // Request garbage collection

        try {
            Thread.sleep(2000); // Give time for GC to run finalize()
        } catch (InterruptedException e) {
            System.out.println("Interrupted.");
        }
    }
}
/*Tank filled.
Tank emptied.
Tank released successfully.
Tank filled.
Error: Tank was not released properly before cleanup!
Tank finalized safely.
*/
