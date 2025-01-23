import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ConducteurTest {

    public static final int CHANGE_SPEED = 80;
    private Driver conducteur;

    @BeforeEach
    public void setUp() {
        this.conducteur = new Driver("John", 20);
    }

    @Test
    public void testEstAdulte() {
        assertThat(this.conducteur.isAdult()).isTrue();
    }

    @Test
    public void testDemarrerVoiture() {
        Car voiture = new Car("Sedan", "Bleu");
        voiture.startCar(this.conducteur);
        // How to assert that the demarrerVoiture method was called?
    }

    @Test
    public void testArreterVoiture() {
        Car voiture = new Car("Sedan", "Bleu");
        voiture.stopCar(this.conducteur);
        // How to assert that the arreterVoiture method was called?
    }

    @Test
    public void testChangerVitesse() {
        Car voiture = new Car("Sedan", "Bleu");

        voiture.changeSpeed(CHANGE_SPEED, this.conducteur);
        assertThat(voiture.getSpeed()).isEqualTo(CHANGE_SPEED);
    }
}
