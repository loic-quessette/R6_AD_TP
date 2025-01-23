import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    private Car voiture;

    @BeforeEach
    public void setUp() {
        voiture = new Car("Sedan", "Bleu");
    }

    @Test
    public void testAccelerer() {
        this.voiture.accelerate();
        assertThat(this.voiture.getSpeed()).isEqualTo(10);
    }

    @Test
    public void testRalentir() {
        this.voiture.accelerate();
        this.voiture.slowDown();
        assertThat(this.voiture.getSpeed()).isEqualTo(0);
    }
}
