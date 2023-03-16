export default class LunchItem {
    // Propriétés de la classe
    type: string;       // Type d'article (ex. entrée, plat principal, dessert)
    name: string;       // Nom de l'article
    description: string;    // Description de l'article
    allergens: string;      // Liste des allergènes dans l'article
    price: number;      // Prix de l'article
    reservable: boolean;    // Indique si l'article est réservable ou non

    /**
     * Constructeur de la classe LunchItem
     * @param type Type d'article (ex. entrée, plat principal, dessert)
     * @param name Nom de l'article
     * @param description Description de l'article
     * @param allergens Liste des allergènes dans l'article
     * @param price Prix de l'article
     * @param reservable Indique si l'article est réservable ou non
     */
    constructor(
        type: string,
        name: string,
        description: string,
        allergens: string,
        price: number,
        reservable: boolean
    ) {
        if (!type || !name || !description || !allergens || price <= 0) {
            throw new Error('Invalid arguments for LunchItem constructor');
        }
        this.type = type;
        this.name = name;
        this.description = description;
        this.allergens = allergens;
        this.price = price;
        this.reservable = reservable;
    }
}
