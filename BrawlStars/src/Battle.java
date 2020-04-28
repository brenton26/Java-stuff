public class Battle {

    public Battle(Brawler player1, Brawler player2){

        while (player1.health > 0){
            fight(player1, player2);
        }
    }


    public void fight(Brawler player1, Brawler player2){
        int firstAttack = player1.weapon.range - player2.weapon.range;


        player2.receiveDamage(player1.attack());
        player1.receiveDamage(player2.attack());
    }
}
