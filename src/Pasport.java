import java.util.Objects;
public class Pasport {
    private String number;
    private String series;

    public Pasport(String number, String series) {
        this.number = number;
        this.series = series;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pasport pasport = (Pasport) o;
        return Objects.equals(this.number, pasport.number) && Objects.equals(this.series, pasport.series);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, series);
    }
}
