package hw1;

enum Cats {
    MALE {
        @Override
        public CatMale getInstance() {
            return new CatMale();
        }
    },
    FEMALE {
        @Override
        public CatFemale getInstance() {
            return new CatFemale();
        }
    };

    public abstract Cat getInstance();

}
