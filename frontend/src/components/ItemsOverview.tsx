import {Item} from "../model/Item";
import "../style/ItemsOverview.css"
import ItemCard from "./ItemCard";

type ItemsOverviewProps = {
    items: Item []
}

export default function ItemsOverview({items} : ItemsOverviewProps){
    return(
        <div className={"item-overview"}>
            {items.map(item => <ItemCard item={item} />)}
        </div>
    )
}
