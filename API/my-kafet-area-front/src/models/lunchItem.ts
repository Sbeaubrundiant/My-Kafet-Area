export default class LunchItem {
    type: string;
    name: string;
    description: string;
    allergens: string;
    price: number;
    reservable: boolean;

    constructor(
        type: string= '...',
        name: string='...',
        description: '...',
        allergens: '...',
        price: number,
        reservable: true
    ) {
        this.type = type;
        this.name = name;
        this.description = description;
        this.allergens = allergens;
        this.price = price;
        this.reservable = reservable;
    }


}