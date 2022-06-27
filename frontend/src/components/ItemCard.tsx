
import {Item} from "../model/Item";

type ItemsCardProps = {
    item: Item;
}

export default function ItemCard({item}: ItemsCardProps) {

    return(
        <div className={"bto-item-card"}>
            <h1>{item.name}</h1>
            <h2>{item.displayId}</h2>
        </div>
    )
}
