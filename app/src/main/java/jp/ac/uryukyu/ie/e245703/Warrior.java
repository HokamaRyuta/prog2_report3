package jp.ac.uryukyu.ie.e245703;

/**
 * 戦士クラス。Heroクラスの上位職。
 *  String name; //戦士の名前
 *  int hitPoint; //戦士のHP
 *  int attack; //戦士の攻撃力
 *  boolean dead; //戦士の生死状態。true=死亡。
 */
public class Warrior extends Hero{
    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name 戦士名
     * @param maximumHP 戦士のHP
     * @param attack 戦士の攻撃力
     */
    public Warrior (String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }

    /**
     * LivingThing へ攻撃するメソッド。
     * attackの150%を固定ダメージとして、wounded()によりダメージ処理を実行。
     * @param opponent 攻撃対象
     */
    public void attackWithWeponSkill(LivingThing opponent){
        if(isDead() == false){
            int damage = (int)(getAttack() * 1.5);
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", getName(), opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }
}
