public class Archive {
    @Override
    public String toString() {
        return id + ": " + name;
    }

    public Archive(String id, String name) {
        this.id = id;
        this.name = name;
    }

    private String id;
    private String name;

    public String getIdentifier() {
        return id;
    }

    public void setIdentifier(String identifier) {
        this.id = identifier;
    }

    public boolean equals(Object compared) {
        Archive archive = (Archive) compared;
        return this.id.equals(archive.id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}