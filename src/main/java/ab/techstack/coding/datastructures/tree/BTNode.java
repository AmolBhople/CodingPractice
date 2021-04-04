package ab.techstack.coding.datastructures.tree;

import lombok.*;

@RequiredArgsConstructor
public class BTNode<T> {
    @Getter
    @NonNull
    private T data;

    @Setter
    @Getter
    private BTNode<T> leftChild;

    @Setter
    @Getter
    private BTNode<T> rightChild;

}
