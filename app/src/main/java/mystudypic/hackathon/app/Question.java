package mystudypic.hackathon.app;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Question extends Fragment {


    /**
     * The view of the question page.
     *
     * @param inflater <p> The LayoutInflater object that can be used to inflate any views in the fragment,  </p>
     * @param container     <p>  If non-null, this is the parent view that the fragment's UI should be attached to.
     *                      The fragment should not add the view itself, but this can be used to generate the LayoutParams of the view. </p>
     * @param savedInstanceState    <p> If non-null, this fragment is being re-constructed from a previous saved state as given here.  </p>
     * @return <p> Return the View for the fragment's UI, or null.  </p>=
     */
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_question, container, false);

        TextView question = (TextView) view.findViewById(R.id.question);
        question.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager()
                        .beginTransaction()
                        .add(R.id.relative, new ImageSolution())   //the front side of the coupon view is replaced with a fragment.
                        .commit();
            }
        });

        return view;
    }
}
