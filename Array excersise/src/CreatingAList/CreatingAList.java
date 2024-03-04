package CreatingAList;


    public class CreatingAList {
        private boolean isEmpty = true;
        private int number;
        private String name;
        private String[] elements = new String[3];

        public boolean isEmpty() {
            if(number==0) return true;
            else return false;
        }

        public void add(String name) {
            if (number < elements.length) {
                elements[number] = name;
                number++;
            } else {
                String[] temp = new String[2 * elements.length];
                number++;
                for (int count = 0; count < temp.length; count++) {
                    temp[count] = elements[count];
                }
                temp[elements.length] = name;
                elements = temp;
            }
        }

        public void remove(String element) {
            number--;
            boolean condition = false;
            for(int count = 0; count < elements.length; count++){
                if(elements[count] != null && elements[count].equals(element)){
                    elements[count] = null;
                    condition = true;
                    break;
                }
            }
            if(!condition) throw new IllegalArgumentException("Not found");
            String[] temp = new String[elements.length];
            int count  = 0;
            for(int counter = 0; counter < elements.length; counter++){
                temp[count] = elements[count];
                count++;
            }
            elements = temp;
        }

        public String getIndex(int index) {
            String result = "";
            if(isEmpty()) throw new IllegalArgumentException("List is empty");
            if(index >= number) throw new IllegalArgumentException("Index out of bounds");
            result = elements[index];
            return result;
        }

        public String getElement(String element) {
            boolean condition = false;
            for(String string : elements){
                if(string != null && string.equals(element)){
                    condition = true;
                    break;
                }
            }
            if(!condition) throw new IllegalArgumentException("Element not found in the list");
            return element;
        }

        public void removeAll(String element) {
            int check = 0;
            for (String string : elements) if (string != null && string.equals(element)) check++;
            number = number - check;
            boolean condition = false;
            for (int count = 0; count < elements.length; count++) {
                if (elements[count] != null && elements[count].equals(element)) elements[count] = null;
                condition = true;
            }
            if (!condition) throw new IllegalArgumentException("Element not found in the list");
            String[] temp = new String[elements.length];
            int count = 0;
            for (int counter = 0; counter < elements.length; counter++) {
                if (elements[count] != null) {
                    temp[count] = elements[counter];
                    count++;
                }
                elements = temp;
            }

        }

        public void insert(String abbey, int index) {
            String[] tempo = new String[elements.length+1];
            int indexCheck = 0;
            for(int number = 0; number < tempo.length; number++){
                if(number == elements.length){
                    tempo[number] = abbey;
                    continue;
                }
                tempo[number] = elements[indexCheck++];
            }
            elements = tempo;
        }
    }



