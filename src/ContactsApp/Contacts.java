package ContactsApp;

class Contacts{
        private String name;
        private String number;

        public Contacts(String name, String number) {
            this.name = name;
            this.number = number;
        }

        public Contacts(String fileEntry) {
            String[] data = fileEntry.split(" | ");
            this.name = data[0];
            this.number = data[data.length - 1];
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getNumber() {
            return this.number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public String toString() {
            return "Name: " + this.name + ", Number: " + this.number;
        }

        public String toFileString() {
            return this.name + " | " + this.number;
        }
}