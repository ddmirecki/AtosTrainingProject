public class HaszyszCode {

    int x = 1;
    @Override
    public int hashCode() {
        return x;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HaszyszCode that = (HaszyszCode) o;
        return x == that.x;
    }
}
